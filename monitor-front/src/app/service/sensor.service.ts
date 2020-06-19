import {HttpClient} from "@angular/common/http";
import {Page} from "../model/Page";
import {Injectable} from "@angular/core";
import {Sensor} from "../model/Sensor";

@Injectable({
  providedIn: 'root'
})
export class SensorService {

  page: Page;

  constructor(
    private http: HttpClient) {
  }

  findAll() {
    return this.http.get<Page>('http://localhost:8080/api/sensor?page=0')
  }

  findById(id: bigint) {
    return this.http.get<Sensor>(`http://localhost:8080/api/sensor/${id}`)
  }

  search(query: string) {
    return this.http.get<Page>(`http://localhost:8080/api/sensor/search?q=${query}&page=0`)
  }

  selectPage(number: number) {
    return this.http.get<Page>(`http://localhost:8080/api/sensor?page=${number}`)
  }

  delete(id: bigint) {
    return this.http.delete(`http://localhost:8080/api/sensor/${id}`)
  }

  createSensor(sensor: Sensor) {
    return this.http.post('http://localhost:8080/api/sensor', sensor)
  }

  updateSensor(sensor: Sensor) {
    return this.http.put<Sensor>(`http://localhost:8080/api/sensor/${sensor.id}`, sensor)
  }
}
