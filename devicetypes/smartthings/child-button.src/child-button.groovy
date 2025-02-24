/**
 *  Child Button
 *
 *  Copyright 2017 SmartThings
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 */
metadata {
<<<<<<< HEAD:devicetypes/smartthings/child-button.src/child-button.groovy
	definition (name: "Child Button", namespace: "smartthings", author: "SmartThings") {
		capability "Button"
		capability "Holdable Button"
=======
	definition (name: "Smoke Detector Child Device", namespace: "erocm123", author: "Eric Maycock", vid:"generic-smoke") {
		capability "Smoke Detector"
>>>>>>> 4540f6f0... Adding vid for new SmartThings app:devicetypes/erocm123/smoke-detector-child-device.src/smoke-detector-child-device.groovy
		capability "Sensor"
	}

	tiles(scale: 2) {
		multiAttributeTile(name: "rich-control", type: "generic", width: 6, height: 4, canChangeIcon: true) {
			tileAttribute("device.button", key: "PRIMARY_CONTROL") {
				attributeState "default", label: ' ', action: "", icon: "st.unknown.zwave.remote-controller", backgroundColor: "#ffffff"
			}
		}
	}
}

def installed() {
	sendEvent(name: "numberOfButtons", value: 1)
}
