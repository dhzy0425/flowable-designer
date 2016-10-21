/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.activiti.designer.kickstart.process.command;

import org.activiti.workflow.simple.definition.StepDefinition;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class StepDefinitionModelUpdater extends KickstartProcessModelUpdater<StepDefinition> {

  public StepDefinitionModelUpdater(StepDefinition businessObject, PictogramElement pictogramElement,
      IFeatureProvider featureProvider) {
    super(businessObject, pictogramElement, featureProvider);
  }

  @Override
  protected StepDefinition cloneBusinessObject(StepDefinition businessObject) {
    return businessObject.clone();
  }

  @Override
  protected void performUpdates(StepDefinition valueObject, StepDefinition targetObject) {
    targetObject.setValues(valueObject);
  }


}
