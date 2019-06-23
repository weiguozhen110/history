import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ToHtmlHomeComponent } from './to-html-home.component';

describe('ToHtmlHomeComponent', () => {
  let component: ToHtmlHomeComponent;
  let fixture: ComponentFixture<ToHtmlHomeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ToHtmlHomeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ToHtmlHomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
