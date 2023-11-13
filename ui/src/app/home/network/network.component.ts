import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-network',
  templateUrl: './network.component.html',
  styleUrls: ['./network.component.css']
})
export class NetworkComponent {
  isPremiumFeatureOn=signal(true);

  togglePremiumFeature(){
    this.isPremiumFeatureOn.update(v=>!v);
  }
}
