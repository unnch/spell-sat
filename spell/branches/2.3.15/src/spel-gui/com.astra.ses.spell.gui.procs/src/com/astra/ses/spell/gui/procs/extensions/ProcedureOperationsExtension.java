///////////////////////////////////////////////////////////////////////////////
//
// PACKAGE   : com.astra.ses.spell.gui.procs.extensions
// 
// FILE      : ProcedureOperationsExtension.java
//
// DATE      : 2008-11-21 08:55
//
// Copyright (C) 2008, 2012 SES ENGINEERING, Luxembourg S.A.R.L.
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
// SUBPROJECT: SPELL GUI Client
//
///////////////////////////////////////////////////////////////////////////////
package com.astra.ses.spell.gui.procs.extensions;

import com.astra.ses.spell.gui.core.interfaces.IProcedureOperation;
import com.astra.ses.spell.gui.core.interfaces.ServiceManager;
import com.astra.ses.spell.gui.core.model.types.ExecutorStatus;
import com.astra.ses.spell.gui.core.model.types.Level;
import com.astra.ses.spell.gui.core.utils.Logger;
import com.astra.ses.spell.gui.procs.interfaces.IProcedureManager;

public class ProcedureOperationsExtension implements IProcedureOperation
{
	private static IProcedureOperation s_mgr	= null;

	public ProcedureOperationsExtension()
	{
		Logger.debug("Created", Level.INIT, this);
		s_mgr = (IProcedureOperation) ServiceManager.get(IProcedureManager.class);
	}

	@Override
	public String getListenerId()
	{
		return s_mgr.getListenerId();
	}

	@Override
	public void notifyRemoteProcedureClosed(String procId, String guiKey)
	{
		s_mgr.notifyRemoteProcedureClosed(procId, guiKey);
	}

	@Override
	public void notifyRemoteProcedureControlled(String procId, String guiKey)
	{
		s_mgr.notifyRemoteProcedureControlled(procId, guiKey);
	}

	@Override
	public void notifyRemoteProcedureKilled(String procId, String guiKey)
	{
		s_mgr.notifyRemoteProcedureKilled(procId, guiKey);
	}

	@Override
	public void notifyRemoteProcedureCrashed(String procId, String guiKey)
	{
		s_mgr.notifyRemoteProcedureCrashed(procId, guiKey);
	}

	@Override
	public void notifyRemoteProcedureMonitored(String procId, String guiKey)
	{
		s_mgr.notifyRemoteProcedureMonitored(procId, guiKey);
	}

	@Override
	public void notifyRemoteProcedureOpen(String procId, String guiKey)
	{
		s_mgr.notifyRemoteProcedureOpen(procId, guiKey);
	}

	@Override
	public void notifyRemoteProcedureReleased(String procId, String guiKey)
	{
		s_mgr.notifyRemoteProcedureReleased(procId, guiKey);
	}

	@Override
	public void notifyRemoteProcedureStatus(String procId,
	        ExecutorStatus status, String guiKey)
	{
		s_mgr.notifyRemoteProcedureStatus(procId, status, guiKey);
	}

}
