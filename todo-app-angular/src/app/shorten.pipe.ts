import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'shorten',
  standalone: true
})
export class ShortenPipe implements PipeTransform {

  transform(value: string, length: number=15): string {
    return value.length>length?value.substring(0,length)+'...':value
  }

}
