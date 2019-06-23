import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RotaryMapComponent } from './rotary-map.component';

describe('RotaryMapComponent', () => {
  let component: RotaryMapComponent;
  let fixture: ComponentFixture<RotaryMapComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RotaryMapComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RotaryMapComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
