import { Component, OnInit } from '@angular/core';
import {expenseList, homeUrl, incomeList} from "../../models/urls";

@Component({
  selector: 'app-navigation-bar',
  templateUrl: './navigation-bar.component.html',
  styleUrls: ['./navigation-bar.component.css']
})
export class NavigationBarComponent implements OnInit {

  home = homeUrl
  incomes = incomeList
  expenses = expenseList

  constructor() { }

  ngOnInit(): void {
  }

}
