import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {Proveedor} from '../proveedor';
import { ProveedoresService } from '../proveedores.service';
import { ProveedorDetalleComponent } from '../proveedor-detalle/proveedor-detalle.component';

@Component({
  selector: 'app-proveedores',
  templateUrl: './proveedores.component.html',
  styleUrls: ['./proveedores.component.css']
})
export class ProveedoresComponentComponent implements OnInit {

  public proveedor = {name: " ",id:0}

  proveedores: Proveedor[] = [];

  selectedProveedor?: Proveedor;

  constructor(private datosProveedor:ProveedoresService) { }

  ngOnInit(): void {
    this.datosProveedor.getProveedor().subscribe((data: any[])=>{
      console.log(data);
      this.proveedores = data;
    })
  }

  onSelect(proveedor: Proveedor):void{
    this.selectedProveedor = proveedor;
  }

}
