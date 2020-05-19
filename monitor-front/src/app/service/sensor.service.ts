import {HttpClient} from "@angular/common/http";
import {Page} from "../model/Page";
import {Injectable} from "@angular/core";

@Injectable()
export class SensorService {

  page: Page;

  constructor(
    private http: HttpClient) {
  }

  findAll() {
    this.http.get<Page>('http://localhost:8080/api/sensor?page=0')
      .subscribe(response => {
        this.page = response
      })
    return this.page
  }

  findById(id: bigint) {
    return undefined;
  }
}
