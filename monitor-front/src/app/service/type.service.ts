import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Type} from "../model/Type";

@Injectable({
  providedIn: 'root'
})
export class TypeService {

  constructor(
    private http: HttpClient) {
  }

  findAll() {
    return this.http.get<Type[]>('http://localhost:8080/api/type')
  }

}
