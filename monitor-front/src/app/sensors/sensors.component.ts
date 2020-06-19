import {Component, OnInit} from '@angular/core';
import {Page} from "../model/Page";
import {Router} from "@angular/router";
import {SensorService} from "../service/sensor.service";

@Component({
  selector: 'app-sensors',
  templateUrl: './sensors.component.html',
  styleUrls: ['./sensors.component.scss'],
  providers: [SensorService]
})
export class SensorsComponent implements OnInit {

  page: Page;
  searchQuery: string = ''

  constructor(
    private service: SensorService,
    private router: Router) {
  }

  ngOnInit() {
    this.service
      .findAll()
      .subscribe(page => {
        this.page = page
      });
  }

  counter(n: number) {
    return Array(n);
  }


  search() {
    if (!this.searchQuery.trim()) {
      this.ngOnInit()
    }
    this.service.search(this.searchQuery)
      .subscribe(response => {
        this.page = response
      })
  }

  selectPage(i: number) {
    this.service.selectPage(i)
      .subscribe(response => {
        this.page = response
      })
  }

  nextPage(p: Page) {
    if (p.last) {
      return
    }
    this.selectPage(++this.page.number)
  }


  previousPage(p: Page) {
    if (p.first) {
      return
    }
    this.selectPage(--this.page.number)
  }

  updateSensor(id: bigint) {
    if (id === null) {
      this.router.navigate(['/sensor'])
    }
    this.router.navigate(['/sensor', id])
  }

  deleteSensor(event: Event, id: bigint, pageNumber: number) {
    event.stopPropagation();
    this.service.delete(id).subscribe(() => {
      this.selectPage(pageNumber);
    })
  }

  createSensor() {
    this.updateSensor(null)
  }
}
