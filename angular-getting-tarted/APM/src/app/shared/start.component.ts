
import { Component, OnChanges, Input, Output, EventEmitter } from '@angular/core';


@Component({
    selector: 'pm-star',
    templateUrl: './star.component.html',
    styleUrls: ['./star.component.css']
})

export class StarComponent implements OnChanges {

    WIDTH: number = 86;
    MAX_STARS: number = 5;

    @Input() rating: number;
    starWidth: number;
    @Output() ratingClicked: EventEmitter<string> = new EventEmitter<string>();

    ngOnChanges(): void {
        this.starWidth = this.rating * this.WIDTH / this.MAX_STARS;
    }

    onClick(): void {
        this.ratingClicked.emit(`The rating ${this.rating} was clicked!`)
    }
}