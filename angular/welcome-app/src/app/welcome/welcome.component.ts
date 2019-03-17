import { Component } from '@angular/core';

@Component({
  selector: 'sw-welcome',
  templateUrl: './welcome.component.html',
  styleUrls : ['./welcome.component.css']
})
export class WelcomeComponent {
  message = 'WelcomeComponent called';
}
