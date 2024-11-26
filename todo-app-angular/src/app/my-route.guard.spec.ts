import { TestBed } from '@angular/core/testing';
import { CanActivateFn } from '@angular/router';

import { myRouteGuard } from './my-route.guard';

describe('myRouteGuard', () => {
  const executeGuard: CanActivateFn = (...guardParameters) => 
      TestBed.runInInjectionContext(() => myRouteGuard(...guardParameters));

  beforeEach(() => {
    TestBed.configureTestingModule({});
  });

  it('should be created', () => {
    expect(executeGuard).toBeTruthy();
  });
});
