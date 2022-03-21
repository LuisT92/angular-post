import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ReportesComponenteComponent } from './reportes-componente/reportes-componente.component';
import { ProveedoresComponentComponent } from './proveedores/proveedores.component';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { ReporteDetalleComponent } from './reporte-detalle/reporte-detalle.component';
import { ProveedorDetalleComponent } from './proveedor-detalle/proveedor-detalle.component';

@NgModule({
  declarations: [
    AppComponent,
    ReportesComponenteComponent,
    ProveedoresComponentComponent,
    ReporteDetalleComponent,
    ProveedorDetalleComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
