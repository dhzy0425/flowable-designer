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
package org.activiti.designer.kickstart.form.features;

import org.activiti.designer.kickstart.form.diagram.KickstartFormFeatureProvider;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;

/**
 * An {@link IResizeShapeFeature} that doesn't allow to resize any elements. 
 * @author Frederik Heremans
 */
public class FormPropertyResizeFeature extends DefaultResizeShapeFeature {

  public FormPropertyResizeFeature(KickstartFormFeatureProvider fp) {
    super(fp);
  }
  
  @Override
  public boolean canResizeShape(IResizeShapeContext context) {
    return false;
  }

}
