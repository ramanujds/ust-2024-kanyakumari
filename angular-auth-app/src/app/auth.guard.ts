import { CanActivateFn } from '@angular/router';

export const authGuard: CanActivateFn = (route, state) => {
  return sessionStorage.getItem('ust.auth') !== null;
  state.url = '/login';
};
