import { Injectable } from '@angular/core';
import { Product } from '../types/product';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ProductResponse } from '../types/productResponse';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private url: string = "http://localhost:9090/api/v1/products";
  products!: Product[];


  constructor(private http: HttpClient) { }

  getProducts(): Observable<ProductResponse> {
    
    return this.http.get<ProductResponse>(this.url)
  }
}
