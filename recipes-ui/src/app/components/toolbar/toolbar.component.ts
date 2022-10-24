import { Component } from "@angular/core";
import { Router } from "@angular/router";

@Component({
    selector: 'app-toolbar',
    templateUrl: './toolbar.component.html',
    styleUrls: ['./toolbar.component.css']
})
export class ToolbarComponent{
    login: boolean = false;
    userName: string = "Ionsecu2";

    constructor(public router: Router) { 
    }

    onClick(){
        this.login = !this.login;
    }
    
    goMyProfile():void {
        console.log("go");
      }

    goToHome(){
        this.router.navigate(['/home']);
    }
}