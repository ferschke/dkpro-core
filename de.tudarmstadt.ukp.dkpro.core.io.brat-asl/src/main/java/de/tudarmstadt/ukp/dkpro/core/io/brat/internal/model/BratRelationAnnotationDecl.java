/*******************************************************************************
 * Copyright 2015
 * Ubiquitous Knowledge Processing (UKP) Lab
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package de.tudarmstadt.ukp.dkpro.core.io.brat.internal.model;

public class BratRelationAnnotationDecl
    extends BratAnnotationDecl
{
    private final String arg1Label;
    private final String arg2Label;

    public BratRelationAnnotationDecl(String aSuperType, String aType, String aArg1Label,
            String aArg2Label)
    {
        super(aSuperType, aType);
        arg1Label = aArg1Label;
        arg2Label = aArg2Label;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(getType());
        sb.append('\t');
        sb.append(arg1Label);
        sb.append(':');
        sb.append(BratConstants.RANGE_ANY);
        sb.append(", ");
        sb.append(arg2Label);
        sb.append(':');
        sb.append(BratConstants.RANGE_ANY);
        return sb.toString();
    }
}
