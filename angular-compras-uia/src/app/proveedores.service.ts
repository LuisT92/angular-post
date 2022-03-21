import { Injectable } from '@angular/core';
import { catchError, Observable, of, tap } from 'rxjs';
import { Proveedor } from './proveedor';
import { HttpClient} from '@angular/common/http'
import { HttpHeaders } from '@angular/common/http';

@Injectable({
    providedIn: 'root'
  })
  export class ProveedoresService {
  
    httpOptions = {
      headers: new HttpHeaders({'Content-Type':'application/json'})
    }
    reportesUrl = "http://localhost:8080/reportes ";
    itemsUrl = "http://localhost:8080/item-rnsi";
    
    constructor(private http: HttpClient) { }
  
    public getProveedor(){
      return this.http.get<Proveedor[]>(this.reportesUrl)
      .pipe(
        tap(_=>console.log('extrayendo catalogos')),
        catchError(this.handleError<Proveedor[]>('loadReporte',[]))
      );
    }
    
    private handleError<T>(operation = 'operation', result?: T){
      return (error: any): Observable<T> => {
      console.error(error);
      console.log(`${operation} failed: ${error.massage}`);
      return of(result as T);
        };
      }

   
   }
  