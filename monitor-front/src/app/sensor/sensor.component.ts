import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Params, Router} from "@angular/router";
import {Sensor} from "../model/Sensor";
import {Unit} from "../model/Unit";
import {Type} from "../model/Type";
import {SensorService} from "../service/sensor.service";
import {UnitService} from "../service/unit.service";
import {TypeService} from "../service/type.service";

@Component({
  selector: 'app-sensor',
  templateUrl: './sensor.component.html',
  styleUrls: ['./sensor.component.scss'],
  providers: []
})
export class SensorComponent implements OnInit {

  sensor: Sensor;
  units: Unit[];
  types: Type[];

  constructor(
    private activatedRoute: ActivatedRoute,
    private sensorService: SensorService,
    private unitService: UnitService,
    private typeService: TypeService,
    private router: Router) {
  }

  ngOnInit(): void {

    this.getUnitsAndTypes();

    this.activatedRoute.params
      .subscribe((params: Params) => {
          if (params.id) {
            this.sensorService.findById(params.id)
              .subscribe(s => {
                this.sensor = s
              });
          }
        }
      )
  }

  cancel() {
    this.router.navigate(['/'])
  }

  saveSensor() {
    if (this.sensor.id === undefined) {
      this.sensorService.createSensor(this.sensor).subscribe(() => {
        this.router.navigate(['/']);
      })
    } else {
      this.sensorService.updateSensor(this.sensor).subscribe(() => {
        this.router.navigate(['/']);
      })
    }
  }

  private getUnitsAndTypes() {

    this.unitService.findAll()
      .subscribe(units => {
        this.units = units;
      })

    this.typeService.findAll()
      .subscribe(types => {
        this.types = types
      })

  }
}
