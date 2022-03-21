import { Component, Input, OnInit } from '@angular/core';
import {IReportes} from '../iReportes';
import { ReportesService } from '../reportes.service';
import { ReporteDetalleComponent } from '../reporte-detalle/reporte-detalle.component';

@Component({
  selector: 'app-reportes-componente',
  templateUrl: './reportes-componente.component.html',
  styleUrls: ['./reportes-componente.component.css'],
})
export class ReportesComponenteComponent implements OnInit {

  public reporte = {name: " ",id:0}

  reportes: IReportes[] = [];

  selectedReporte?: IReportes;

  constructor(private datosReportes:ReportesService) { }

  ngOnInit(): void {

    this.datosReportes.getReportes().subscribe((data: any[])=>{
      console.log(data);
      this.reportes = data;
    })
  }

  onSelect(reporte: IReportes):void{
    this.selectedReporte = reporte;
  }

  agregar(name:String,id:String):void{
    name = name.trim();

    var newReporte = <IReportes>{};

    newReporte.id=Number(id);
    newReporte.name="name";
    newReporte.type="reporte";

    if(!name){return;}
    this.datosReportes.agregaReporte(newReporte).
    subscribe(reporte =>{
      this.reportes.push(reporte);
    })
  }
}
