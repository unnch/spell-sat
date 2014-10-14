///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.gui.replay.dialogs.execution
// 
// FILE      : ExecutionSelectionContentProvider.java
//
// DATE      : Jul 1, 2013
//
// Copyright (C) 2008, 2014 SES ENGINEERING, Luxembourg S.A.R.L.
//
// By using this software in any way, you are agreeing to be bound by
// the terms of this license.
//
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://www.eclipse.org/legal/epl-v10.html
//
// NO WARRANTY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, THE PROGRAM IS PROVIDED
// ON AN "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, EITHER
// EXPRESS OR IMPLIED INCLUDING, WITHOUT LIMITATION, ANY WARRANTIES OR
// CONDITIONS OF TITLE, NON-INFRINGEMENT, MERCHANTABILITY OR FITNESS FOR A
// PARTICULAR PURPOSE. Each Recipient is solely responsible for determining
// the appropriateness of using and distributing the Program and assumes all
// risks associated with its exercise of rights under this Agreement ,
// including but not limited to the risks and costs of program errors,
// compliance with applicable laws, damage to or loss of data, programs or
// equipment, and unavailability or interruption of operations.
//
// DISCLAIMER OF LIABILITY
// EXCEPT AS EXPRESSLY SET FORTH IN THIS AGREEMENT, NEITHER RECIPIENT NOR ANY
// CONTRIBUTORS SHALL HAVE ANY LIABILITY FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING WITHOUT LIMITATION
// LOST PROFITS), HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
// CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
// ARISING IN ANY WAY OUT OF THE USE OR DISTRIBUTION OF THE PROGRAM OR THE
// EXERCISE OF ANY RIGHTS GRANTED HEREUNDER, EVEN IF ADVISED OF THE
// POSSIBILITY OF SUCH DAMAGES.
//
// Contributors:
//    SES ENGINEERING - initial API and implementation and/or initial documentation
//
// PROJECT   : SPELL
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.gui.replay.dialogs.execution;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class ExecutionSelectionContentProvider implements ITreeContentProvider
{
	private IExecutionSelectionModel m_model;
	
	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public void dispose()
    {
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
    {
	    m_model = (IExecutionSelectionModel) newInput;
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public Object[] getElements(Object inputElement)
    {
	    return m_model.getRoot().getChildren().toArray();
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public Object[] getChildren(Object parentElement)
    {
	    ExecutionSelectionNode node = (ExecutionSelectionNode) parentElement;
	    return node.getChildren().toArray();
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public Object getParent(Object element)
    {
	    ExecutionSelectionNode node = (ExecutionSelectionNode) element;
	    return node.getParent();
    }

	/***************************************************************************
	 * 
	 **************************************************************************/
	@Override
    public boolean hasChildren(Object element)
    {
	    ExecutionSelectionNode node = (ExecutionSelectionNode) element;
	    return node.hasChildren();
    }

}