import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class QuizService {
  constructor(private http: HttpClient) {}

  get(url: string) {
    return this.http.get(url);
  }

  getAll() {
    return [
      {
        id: 'data/SQL.json',
        name: 'SQL',
        description:
          "Let's Play SQL quiz that will help you clear the concepts and will prepare you for interviews. This is a basic level quiz and contains 10 Questions.",
        imageUrl: 'assets/images/sql.png',
      },
      {
        id: 'data/java.json',
        name: 'Java',
        description:
          "Let's Play java quiz that will help you clear the concepts and will prepare you for interviews. This is a basic level quiz and contains 10 Questions.",
        imageUrl: 'assets/images/java.jpg',
      },
     
    ];
  }
}
