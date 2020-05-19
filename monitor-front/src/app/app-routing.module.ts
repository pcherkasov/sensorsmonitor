import {NgModule} from "@angular/core";
import {RouterModule, Routes} from "@angular/router";
import {SensorComponent} from "./sensor/sensor.component";
import {SensorsComponent} from "./sensors/sensors.component";

const routes: Routes = [
  {path: '', component: SensorsComponent},
  {path: 'sensor/:id', component: SensorComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {

}
