import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { MessageBubbleComponent } from '../message-bubble/message-bubble.component';


@Component({
  selector: 'app-chat',
  standalone: true,
  imports: [CommonModule, FormsModule, MessageBubbleComponent],
  templateUrl: './chat.component.html'
})
export class ChatComponent {
  messages = [
    { text: 'Hello! How can I help you today?', type: 'bot' },
    { text: 'Can you summarize the document I uploaded?', type: 'user' },
    { text: 'Sure! It looks like the document discusses Azure AI integration...', type: 'bot' },
    { text: 'Please Shut Up your Mouth', type: 'user' }
  ];
}
