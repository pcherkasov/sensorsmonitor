import {Sensor} from "./Sensor";

export interface Page {
  content: Sensor[],
  totalPages: number,
  totalElements: number,
  first: boolean,
  last: boolean,
  number: number,
  size: number,
  numberOfElements: number,
  empty: boolean
}
