import {Injectable} from '@angular/core';
import {catchError, Observable, of, tap} from 'rxjs';
import {IReporte} from './reportes/IReporte';
import {HttpClient} from '@angular/common/http';
import {HttpHeaders} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})

export class ReporteService {

  HttpOption =
    {
      headers: new HttpHeaders({'Content Type': 'application/json'})
    }
  reportesUrl = "http://localhost:8080/reportes"

  constructor(private http: HttpClient) {
  }

public getReportes()
{
        return this.http.get<IReporte[]>(this.reportesUrl)
      .pipe(
        tap(_ => console.log('extrayendo catalogos')),
      catchError(this.handleError<IReporte[]>('loadReporte', []))
  );
}

private handleError<T> (operation = 'operation', result?: T){
  return (error: any): Observable<T> => {
  console.error(error);
  console.log('${operation} failed: ${error.message}');
  return of(result as T);
};
}

agregaReporte(Reporte: IReporte): Observable<IReporte>{
  return this.http.post<IReporte>(this.reportesUrl, Reporte, this.HttpOption).pipe(
    tap((newReporte: IReporte) => console.log(`added Reporte w/ id=${newReporte.id}`)),
    catchError(this.handleError<IReporte>('addReporte'))
  );
  }
}

