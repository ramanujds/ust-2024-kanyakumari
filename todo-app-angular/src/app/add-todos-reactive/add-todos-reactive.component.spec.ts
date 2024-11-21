import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddTodosReactiveComponent } from './add-todos-reactive.component';

describe('AddTodosReactiveComponent', () => {
  let component: AddTodosReactiveComponent;
  let fixture: ComponentFixture<AddTodosReactiveComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddTodosReactiveComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddTodosReactiveComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
