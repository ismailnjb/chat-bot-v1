import { Component, Input } from '@angular/core';
import { CommonModule } from '@angular/common';
@Component({
  selector: 'app-message-bubble',
  imports: [CommonModule],
  standalone: true,
  templateUrl: './message-bubble.component.html',
  styleUrl: './message-bubble.component.scss'
})
export class MessageBubbleComponent {
  @Input() text: string = '';
  @Input() alignment: 'left' | 'right' = 'left';
  @Input() color: 'white' | 'blue' = 'white';

  get alignmentClass() {
    return this.alignment === 'right' ? 'flex justify-end' : 'flex justify-start';
  }

  get bubbleClass() {
    return this.color === 'blue'
      ? 'bg-blue-500 text-white rounded-br-none'
      : 'bg-white text-gray-700 shadow rounded-bl-none';
  }
}
