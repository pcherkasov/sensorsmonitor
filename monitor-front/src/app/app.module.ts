import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {FormsModule} from "@angular/forms";
import {HttpClientModule} from "@angular/common/http";
import {SensorComponent} from './sensor/sensor.component';
import {AppRoutingModule} from "./app-routing.module";
import {SensorsComponent} from "./sensors/sensors.component";
import {AppComponent} from "./app.component";

@NgModule({
  declarations: [
    SensorsComponent,
    SensorComponent,
    AppComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
