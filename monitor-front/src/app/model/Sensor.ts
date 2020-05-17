export interface Sensor {
  id: bigint,
  name: string,
  model: string,
  rangeFrom: number,
  rangeTo: number,
  type: string,
  unit: string,
  location: string,
  description: string
}
