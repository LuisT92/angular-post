import { Component, Input, OnInit } from '@angular/core';
import { IReportes } from '../iReportes';

@Component({
  selector: 'app-reporte-detalle',
  templateUrl: './reporte-detalle.component.html',
  styleUrls: ['./reporte-detalle.component.css']
})
export class ReporteDetalleComponent implements OnInit {

  @Input() reporte?: IReportes;

  constructor() { }

  ngOnInit(): void {
  }

}
