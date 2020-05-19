import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Params} from "@angular/router";
import {Sensor} from "../model/Sensor";
import {Unit} from "../model/Unit";
import {Type} from "../model/Type";
import {SensorService} from "../service/sensor.service";

@Component({
  selector: 'app-sensor',
  templateUrl: './sensor.component.html',
  styleUrls: ['./sensor.component.scss'],
  providers: [SensorService]
})
export class SensorComponent implements OnInit {

  sensor: Sensor;
  units: Unit[];
  types: Type[];

  constructor(
    private route: ActivatedRoute,
    private sensorService: SensorService) { }

  ngOnInit(): void {
    this.route.params.subscribe( (params: Params) => {
      this.sensor = this.sensorService.findById(parseInt(params))
      }
    )
  }

}
