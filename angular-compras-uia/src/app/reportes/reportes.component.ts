import { Component, OnInit } from '@angular/core';
import { } from '@angular/forms';
import { ReporteService } from '../reporte.service';
import { IReporte } from './IReporte';

@Component({
  selector: 'app-reportes',
  templateUrl: './reportes.component.html',
  styleUrls: ['./reportes.component.css']
})
export class ReportesComponent implements OnInit {

  public reporte: IReporte = {id: 1, name: "Luis", codigo: "123", vendedor: 1,
  clasficacionVendedor: 1, total: 1, entrega: 1};

  reportes: IReporte[] = [];

  selectedReporte?: IReporte;

  onSelect(reporte: IReporte): void {
    this.selectedReporte = reporte;
  }

  constructor(private datosReporte: ReporteService) { }

  ngOnInit(): void {
    this.datosReporte.getReportes().subscribe((data: any[])=>{
      console.log(data);
      this.reportes = data;
  });

  }
}
