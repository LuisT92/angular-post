import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProveedoresComponentComponent } from './proveedores.component';

describe('ProveedoresComponent', () => {
  let component: ProveedoresComponentComponent;
  let fixture: ComponentFixture<ProveedoresComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProveedoresComponentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ProveedoresComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
