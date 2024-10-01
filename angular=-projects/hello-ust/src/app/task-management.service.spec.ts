import { TestBed } from '@angular/core/testing';

import { TaskManagementService } from './task-management.service';

describe('TaskManagementService', () => {
  let service: TaskManagementService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TaskManagementService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
