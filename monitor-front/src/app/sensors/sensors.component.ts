import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Page} from "../model/Page";
import {Sensor} from "../model/Sensor";
import {Router} from "@angular/router";
import {SensorService} from "../service/sensor.service";

@Component({
  selector: 'app-sensors',
  templateUrl: './sensors.component.html',
  styleUrls: ['./sensors.component.scss'],
  providers: [SensorService]
})
export class SensorsComponent implements OnInit{

  page: Page;
  searchQuery: string = ''

  constructor(
    private http: HttpClient,
    private service: SensorService,
    private router: Router) {
  }

  ngOnInit() {
    this.page = this.service.findAll();
  }

  counter(n: number) {
    return Array(n);
  }


  search() {
    if (!this.searchQuery.trim()) {
      this.ngOnInit()
    }
    this.http.get<Page>(`http://localhost:8080/api/sensor/search?q=${this.searchQuery}&page=0`)
      .subscribe(response => {
        this.page = response
      })
  }

  selectPage(i: number) {
    this.http.get<Page>(`http://localhost:8080/api/sensor?page=${i}`)
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
    this.router.navigate(['/post', id])
  }
}
