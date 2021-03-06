import {Component, OnInit} from '@angular/core';
import {ProvinciaService} from './provincia.service';

@Component({
  selector: 'app-provincia',
  template:
    `
    <p *ngFor="let provincia of provincias">
      {{provincia.nombre}}
    </p>
  `,
})
export class ProvinciaComponent implements OnInit {

  provincias;

  alumnos: Array<any> = [
    {nombre: 'Jorge', esPrimaria: false},
    {nombre: 'Juan', esPrimaria: true},
    {nombre: 'Jose', esPrimaria: false}
  ];

  ngOnInit(): void {
    const obs = this.provinciaService
      .getDiezProvincias()
      .toPromise();

    obs.then(datos => {
      this.provincias = datos;
      console.log('dentro', this.provincias);
    }).catch(err => console.log(err));

    // obs.subscribe(datos => {
    //   this.provincias = datos;
    //   console.log('dentro', this.provincias);
    // }, err => console.log(err));
  }

  constructor(private provinciaService: ProvinciaService) {
  }

  escuchar($event) {
    console.log('Padre', $event);
  }

}
