package com.xworkz.houserunner;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.DTO.HouseDTO;
import com.xworkz.constants.OwningType;
import com.xworkz.constants.Type;

public class HouseRunner {
	
public static void main(String[] args) {
			Collection<HouseDTO> list = new ArrayList<HouseDTO>();
		
			HouseDTO dto1 = new HouseDTO(1, "Shree", "Vanita", Type.APARTMENT, 8,true, OwningType.OWN, 800.00D);
			HouseDTO dto2 = new HouseDTO(3, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 700.00D);
			HouseDTO dto3 = new HouseDTO(5, "Shree", "Vanita", Type.VILLA, 8, false, OwningType.RENT, 600.00D);
			HouseDTO dto4 = new HouseDTO(7, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.OWN, 500.00D);
			HouseDTO dto5 = new HouseDTO(9, "Shree", "Vanita", Type.APARTMENT, 8, false, OwningType.RENT, 400.00D);
			HouseDTO dto6 = new HouseDTO(23, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 1100.00D);
			HouseDTO dto7 = new HouseDTO(25, "Shree", "Vanita", Type.VILLA, 8, false, OwningType.OWN, 900.00D);
			HouseDTO dto8 = new HouseDTO(26, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 1200.00D);
			HouseDTO dto9 = new HouseDTO(28, "Shree", "Vanita", Type.APARTMENT, 8, false, OwningType.RENT, 1300.00D);
			HouseDTO dto10 = new HouseDTO(30, "Shree", "Vanita", Type.VILLA, 8, true, OwningType.OWN, 1400.00D);
			HouseDTO dto11 = new HouseDTO(32, "Shree", "Vanita", Type.APARTMENT, 8, false, OwningType.LEASE, 200.00D);
			HouseDTO dto12 = new HouseDTO(34, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.OWN, 100.00D);
			HouseDTO dto13 = new HouseDTO(36, "Shree", "Vanita", Type.VILLA, 8, true, OwningType.RENT, 150.00D);
			HouseDTO dto14 = new HouseDTO(38, "Shree", "Vanita", Type.APARTMENT, 8, false, OwningType.LEASE, 250.00D);
			HouseDTO dto15= new HouseDTO(39, "Shree", "Vanita", Type.VILLA, 8, true, OwningType.LEASE, 350.00D);
			HouseDTO dto16= new HouseDTO(40, "Shree", "Vanita", Type.APARTMENT, 8, true, OwningType.OWN, 8500.00D);
			HouseDTO dto17 = new HouseDTO(42, "Shree", "Vanita", Type.VILLA, 8, false, OwningType.RENT, 950.00D);
			HouseDTO dto18 = new HouseDTO(2, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 1500.00D);
			HouseDTO dto19 = new HouseDTO(4, "Shree", "Vanita", Type.INDIVIDUAL, 8, true, OwningType.LEASE, 1500.00D);
		    list.add(dto1);
		    list.add(dto2);
		    list.add(dto3);
		    list.add(dto4);
		    list.add(dto5);
		    list.add(dto6);
		    list.add(dto7);
		    list.add(dto8);
		    list.add(dto9);
		    list.add(dto10);
		    list.add(dto11);
		    list.add(dto12);
		    list.add(dto13);
		    list.add(dto14);
		    list.add(dto15);
		    list.add(dto16);
		    list.add(dto17);
		    list.add(dto18);
		    list.add(dto19);
		    list.forEach((ref) -> System.out.println(ref));
			System.out.println("loop created");
			
			list.stream().sorted((e1, e2) -> e1.getId().compareTo(e2.getId())).forEach((ref) -> System.out.println(ref));
			System.out.println("sorted based on the id");
			list.stream().sorted((e1, e2) -> e1.getId().compareTo(e2.getId())).forEach((ref) -> System.out.println(ref));
			System.out.println("sorted based on the getId");
			list.stream().sorted((e1,e2)->e2.getId().compareTo(e1.getId())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the getId");
			list.stream().sorted((e1,e2)->e1.gethName().compareTo(e2.gethName())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the gethName");
			list.stream().sorted((e1,e2)->e2.getType().getValue().compareTo(e1.getType().getValue())).forEach((ref)->System.out.println(ref));;
			System.out.println("sorted based on the getType, getValue");
			list.stream().sorted((e1,e2)->e2.getSqFeet().compareTo(e1.getSqFeet())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the getSqFeet");
			list.stream().filter((ref)->ref.gethLoan()==false).sorted((e1,e2)->e2.gethOwner().compareTo(e1.gethOwner())).forEach((ref)->System.out.println(ref));;
			System.out.println("*******************");
			list.stream().filter((ref)->ref.gethLoan()==true).sorted((e1,e2)->e2.gethOwner().compareTo(e2.gethOwner())).forEach((ref)->System.out.println(ref));;
			System.out.println("sorted based on the gethLoan ");
			list.stream().filter((ref)->ref.getOwningType().getValue().equals("lease"))	.sorted((e1,e2)->e1.getOwningType().getValue().compareTo(e2.getOwningType().getValue())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the getOwningType");
			list.stream().filter((ref)->ref.getType().getValue().equals("apartment")).sorted((e1,e2)->e1.getType().getValue().compareTo(e2.getType().getValue())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the type");
			list.stream().filter((ref)->ref.getType().getValue().equals("villa")).sorted((e1,e2)->e1.getType().getValue().compareTo(e2.getType().getValue())).forEach((ref)->System.out.println(ref));
			System.out.println("sorted based on the type");
			list.stream().sorted((e1,e2)->{
			int m=e1.getType().getValue().compareTo(e2.getType().getValue());
			if(m==0) {
				return e1.getOwningType().getValue().compareTo(e2.getOwningType().getValue());

			}
			return m;
			}).forEach((ref)->System.out.println(ref));

			System.out.println("sorting with reference");

			list.stream().sorted((e1,e2)->{
			int m=e1.gethName().compareTo(e2.gethName());
			if(m==0) {
				return e1.getId().compareTo(e2.getId());

			}
			return m;

			}).forEach((ref)->System.out.println(ref));
		}

	

	}


