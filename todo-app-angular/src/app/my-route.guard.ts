import { CanActivateFn } from '@angular/router';

export const myRouteGuard: CanActivateFn = (route, state) => {
  
  const check = sessionStorage.getItem('isloggedin')

  return check!=null

};
