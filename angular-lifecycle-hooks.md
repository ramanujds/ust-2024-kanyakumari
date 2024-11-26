# Angular Lifecycle Hooks 


---

## 1. `ngOnChanges()`
- **When it’s called**: Invoked whenever there is a change in the input-bound (`@Input()`) properties of a component or directive.
- **Use Case**: Responding to changes in input properties, like recalculating values or updating the UI.

### Example:
```typescript
import { Component, Input, OnChanges, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-child',
  template: `<p>Current Value: {{ value }}</p>`
})
export class ChildComponent implements OnChanges {
  @Input() value!: number;

  ngOnChanges(changes: SimpleChanges) {
    console.log('Changes detected:', changes);
  }
}
```

---

## 2. `ngOnInit()`
- **When it’s called**: Once, after the component is initialized and input properties are set.
- **Use Case**: Initializing data or making service calls for setup.

### Example:
```typescript
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-example',
  template: `<p>Data: {{ data }}</p>`
})
export class ExampleComponent implements OnInit {
  data: string = '';

  ngOnInit() {
    this.data = 'Component Initialized!';
  }
}
```

---

## 3. `ngDoCheck()`
- **When it’s called**: Called during every change detection run, even for changes Angular does not detect.
- **Use Case**: Custom change detection or additional checks that Angular doesn’t cover.

### Example:
```typescript
import { Component, DoCheck } from '@angular/core';

@Component({
  selector: 'app-check',
  template: `<p>Counter: {{ counter }}</p>`
})
export class CheckComponent implements DoCheck {
  counter = 0;

  ngDoCheck() {
    console.log('Change detection triggered!');
    this.counter++;
  }
}
```

---

## 4. `ngAfterContentInit()`
- **When it’s called**: Once, after Angular projects external content (e.g., `<ng-content>`) into the component.
- **Use Case**: Initializing logic that depends on projected content.

### Example:
```typescript
import { Component, AfterContentInit } from '@angular/core';

@Component({
  selector: 'app-content',
  template: `<ng-content></ng-content>`
})
export class ContentComponent implements AfterContentInit {
  ngAfterContentInit() {
    console.log('Projected content initialized.');
  }
}
```

---

## 5. `ngAfterContentChecked()`
- **When it’s called**: After Angular checks the projected content during change detection.
- **Use Case**: Responding to changes in projected content.

### Example:
```typescript
import { Component, AfterContentChecked } from '@angular/core';

@Component({
  selector: 'app-content-check',
  template: `<ng-content></ng-content>`
})
export class ContentCheckComponent implements AfterContentChecked {
  ngAfterContentChecked() {
    console.log('Projected content checked.');
  }
}
```

---

## 6. `ngAfterViewInit()`
- **When it’s called**: Once, after Angular initializes the component’s view and child views.
- **Use Case**: Accessing or manipulating the component’s view children.

### Example:
```typescript
import { Component, AfterViewInit, ViewChild, ElementRef } from '@angular/core';

@Component({
  selector: 'app-view',
  template: `<p #viewContent>View Content</p>`
})
export class ViewComponent implements AfterViewInit {
  @ViewChild('viewContent') content!: ElementRef;

  ngAfterViewInit() {
    console.log(this.content.nativeElement.textContent);
  }
}
```

---

## 7. `ngAfterViewChecked()`
- **When it’s called**: After the component’s view and child views have been checked by the change detection mechanism.
- **Use Case**: Responding to changes in the view after Angular's check.

### Example:
```typescript
import { Component, AfterViewChecked } from '@angular/core';

@Component({
  selector: 'app-view-check',
  template: `<p>View checked!</p>`
})
export class ViewCheckComponent implements AfterViewChecked {
  ngAfterViewChecked() {
    console.log('View checked!');
  }
}
```

---

## 8. `ngOnDestroy()`
- **When it’s called**: Before Angular destroys the component or directive.
- **Use Case**: Cleanup tasks, like unsubscribing from observables or detaching event listeners.

### Example:
```typescript
import { Component, OnDestroy } from '@angular/core';

@Component({
  selector: 'app-destroy',
  template: `<p>Component Destroyed!</p>`
})
export class DestroyComponent implements OnDestroy {
  ngOnDestroy() {
    console.log('Component destroyed.');
  }
}
```

---

## Summary Table of Hooks

| **Lifecycle Hook**      | **Purpose**                                | **Called**                                                                 |
|--------------------------|--------------------------------------------|-----------------------------------------------------------------------------|
| `ngOnChanges`            | Respond to input property changes          | When input properties change                                               |
| `ngOnInit`               | Initialize the component                   | Once, after the first `ngOnChanges`                                        |
| `ngDoCheck`              | Custom change detection logic              | During every change detection run                                          |
| `ngAfterContentInit`     | Initialize projected content               | Once, after content is projected                                           |
| `ngAfterContentChecked`  | Respond to projected content changes       | After projected content is checked                                         |
| `ngAfterViewInit`        | Initialize component and child views       | Once, after the view and child views are initialized                       |
| `ngAfterViewChecked`     | Respond to component and child view changes| After the view and child views are checked                                 |
| `ngOnDestroy`            | Cleanup before component destruction       | Once, before the component or directive is destroyed                       |

---

## Best Practices
- Use **`ngOnInit`** for initialization rather than the constructor.
- Avoid heavy logic in **`ngDoCheck`** or **`ngAfterViewChecked`** as they are called frequently.
- Always clean up resources in **`ngOnDestroy`** to prevent memory leaks.
