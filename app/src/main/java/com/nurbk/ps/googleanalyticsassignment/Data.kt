package com.nurbk.ps.googleanalyticsassignment

import com.nurbk.ps.googleanalyticsassignment.model.Categories
import com.nurbk.ps.googleanalyticsassignment.model.Product


val products = arrayListOf(
    Product(
        "1", "1", "HP Laptop - 15t-dy200 touch optional",
        "Windows 10 Home 64\n" +
                "11th Gen Intel® Core™ i7 processor\n" +
                "Intel® Iris® Xe Graphics\n" +
                "16 GB memory; 256 GB SSD storage", 4.5f, R.drawable.l1
    ),
    Product(
        "2", "1", "HP Laptop - 17z-ca300",
        "Windows 10 Home 64\n" +
                "AMD Ryzen™ 5 processor\n" +
                "AMD Radeon™ Graphics\n" +
                "12 GB memory; 256 GB SSD storage", 2.5f, R.drawable.l3
    ),
    Product(
        "3", "1", "HP Laptop - 17z-ca100",
        "Windows 10 Home 64\n" +
                "AMD Ryzen™ 5 processor\n" +
                "AMD Radeon™ Vega 8 Graphics\n" +
                "12 GB memory; 256 GB SSD storage", 3.5f, R.drawable.l2
    ),
    Product(
        "4", "2", "Hamdan Restaurant People's Food",
        "Address: Al-Istiqlal St.، غزة\n" +
                "Hours: \n" +
                "Open ⋅ Closes 6PM\n" +
                "Phone: 0567 788 280\n" +
                "Suggest an edit · Own this business?\n" +
                "Add missing information\n" +
                "Add website", 4.2f, R.drawable.f1
    ),
    Product(
        "5", "2", "Fresh Food",
        " Dine-in· Takeaway\n" +
                "Address: Al-Istiqlal St.، غزة\n" +
                "Hours: \n" +
                "Open ⋅ Closes 6PM\n" +
                "Phone: 0567 788 280\n" +
                "Suggest an edit · Own this business?\n" +
                "Add missing information", 3.2f, R.drawable.f2
    ),
    Product(
        "6", "2", "Al Taboon Pizza",
        " Dine-in· Takeaway· No-contact delivery\n" +
                "Address: Omar Mukhtar St\n" +
                "Hours: \n" +
                "Closed ⋅ Opens 9:30AM Wed\n" +
                "Phone: +972 8-288-6880\n" +
                "Suggest an edit · \n" +
                "Own this business?", 5f, R.drawable.f3
    ),
    Product(
        "7", "3", "Star Company for the import of cars",
        "Address: جباليا، التوام\n" +
                "Hours: \n" +
                "Open 24 hours\n" +
                "Suggest an edit · \n" +
                "Own this business?\n" +
                "Add missing information\n" +
                "Add phone number\n" +
                "Add website", 5f, R.drawable.c1
    ),
    Product(
        "7", "3", "L.G MOTORS - luxury cars for sale",
        "Address: جباليا، التوام\n" +
                "Address: David Saharov St 9, Rishon LeTsiyon, Israel\n" +
                "Hours: \n" +
                "Open ⋅ Closes 7:30PM\n" +
                "Phone: +972 3-551-1692", 4f, R.drawable.c2
    ),
    Product(
        "7", "3", "Yafa Car Rental",
        "Address: Rehov Omar Mukhtar\n" +
                "Hours: \n" +
                "Open ⋅ Closes 6PM\n" +
                "Phone: +972 59-808-7070", 3f, R.drawable.c3
    ),
)


val categories = arrayListOf(
    Categories(
        "1", "Laptops", R.drawable.l1
    ),
    Categories(
        "2", "Food", R.drawable.f1
    ),
    Categories(
        "3", "Cars", R.drawable.c1
    ),
)