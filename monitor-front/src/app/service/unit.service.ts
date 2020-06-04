import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Unit} from "../model/Unit";

@Injectable({
  providedIn: 'root'
})
export class UnitService {

  constructor(
    private http: HttpClient) {
  }

  findAll() {
    return this.http.get<Unit[]>('http://localhost:8080/api/unit')
  }

}
