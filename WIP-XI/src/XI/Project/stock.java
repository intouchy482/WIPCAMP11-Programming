/*
 * Copyright (C) 2019 WipCamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class stock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item = 3;
        int limit = 10;
        int amount = 0;
        int menu = sc.nextInt();

        if (menu == 1) {
            if (item < limit) {
                System.out.println("Add item");
            }
            amount = sc.nextInt();

            if (item + amount > limit) {
                System.out.println("Too much");
            } else {
                item = amount + item;
                System.out.println("item");

                System.out.println("Item too much");

            }

        } else if (menu == 2) {
            if (item > 0) {
                System.out.println("remove item");
                int remove = sc.nextInt();
                amount = amount - remove;
                if (item - remove < 0) {
                    System.out.println("Item not enough for remove");
                } else {
                    item = item - remove;
                    System.out.println("เหลือไอเท็ม" + item);

                }

            } else {
                System.out.println("not enough item");
            }

        } else if (menu == 3) {
            System.out.println("amount of item"+item);

        } else {
            System.out.println("not any menu");
        }
    }
}
