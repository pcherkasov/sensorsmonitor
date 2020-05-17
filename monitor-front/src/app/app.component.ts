import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Page} from "./model/Page";
import {Sensor} from "./model/Sensor";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit{
  title = 'monitor-front';

  page: Page;
  searchQuery: string = ''

  constructor(private http: HttpClient) {
  }

  ngOnInit() {
    this.http.get<Page>('http://localhost:8080/api/sensor?page=0')
      .subscribe(response => {
        this.page = response
      })
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

  updateSensor(sensor: Sensor) {

  }
}
