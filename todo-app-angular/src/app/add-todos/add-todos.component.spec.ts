import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddTodosComponent } from './add-todos.component';

describe('AddTodosComponent', () => {
  let component: AddTodosComponent;
  let fixture: ComponentFixture<AddTodosComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddTodosComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddTodosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
