/*******************************************************************************
 * Copyright (c) 2018 Fraunhofer IEM, Paderborn, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Johannes Spaeth - initial API and implementation
 *******************************************************************************/
webix.i18n.locales["en-US"]={
	groupDelimiter:",",
	groupSize:3,
	decimalDelimiter:".",
	decimalSize:2,

	dateFormat:"%m/%d/%Y",
	timeFormat:"%h:%i %A",
	longDateFormat:"%d %F %Y",
	fullDateFormat:"%m/%d/%Y %h:%i %A",
	am:["am","AM"],
	pm:["pm","PM"],

	price:"${obj}",
	priceSettings:{
        groupDelimiter:",",
        groupSize:3,
        decimalDelimiter:".",
        decimalSize:2
    },
	fileSize: ["b","Kb","Mb","Gb","Tb","Pb","Eb"],
	
	calendar: {
		monthFull:["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"],
		monthShort:["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
		dayFull:["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
    	dayShort:["Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"],
		hours: "Hours",
		minutes: "Minutes",
		done:"Done",
		clear: "Clear",
		today: "Today"
    },

    controls:{
    	select:"Select",
    	invalidMessage: "Invalid input value"
    },
    dataExport:{
		page:"Page",
		of:"of"
    },
    PDFviewer:{
		of:"of",
		automaticZoom:"Automatic Zoom",
		actualSize:"Actual Size",
		pageFit:"Page Fit",
		pageWidth:"Page Width",
		pageHeight:"Page Height"
    },
    aria:{
		increaseValue:"Increase value",
		decreaseValue:"Decrease value",
		navMonth:["Previous month", "Next month"],
		navYear:["Previous year", "Next year"],
		navDecade:["Previous decade", "Next decade"],
		removeItem:"Remove item",
		pages:["First page", "Previous page", "Next page", "Last page"],
		page:"Page",
		headermenu:"Header menu",
		openGroup:"Open column group",
		closeGroup:"Close column group",
		closeTab:"Close tab",
		showTabs:"Show more tabs",
		resetTreeMap:"Reset tree map",
		navTreeMap:"Level up",
		nextTab:"Next tab",
		prevTab:"Previous tab",
		multitextSection:"Add section",
		multitextextraSection:"Remove section",
		showChart:"Show chart",
		hideChart:"Hide chart",
		resizeChart:"Resize chart"
    },
    richtext:{
        underline: "Underline",
        bold: "Bold",
        italic: "Italic"
    }
};