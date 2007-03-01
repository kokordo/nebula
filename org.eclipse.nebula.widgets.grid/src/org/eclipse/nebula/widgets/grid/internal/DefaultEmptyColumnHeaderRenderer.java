/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    chris.gross@us.ibm.com - initial API and implementation
 *******************************************************************************/ 
package org.eclipse.nebula.widgets.grid.internal;

import org.eclipse.nebula.widgets.grid.AbstractRenderer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Point;

public class DefaultEmptyColumnHeaderRenderer extends AbstractRenderer
{

    public DefaultEmptyColumnHeaderRenderer()
    {
        super();

    }

    public Point computeSize(GC gc, int wHint, int hHint, Object value)
    {
        return new Point(wHint, hHint);
    }

    public void paint(GC gc, Object value)
    {
        gc.setBackground(getDisplay().getSystemColor(SWT.COLOR_WIDGET_BACKGROUND));

        gc.fillRectangle(getBounds().x, getBounds().y, getBounds().width + 1,
                         getBounds().height + 1);

        // gc.setForeground(ThemeManager.getCurrentTheme().getColor(CONTROL_TYPE
        // + "/Border.HeaderInner.TopLeft"));
        // gc.drawLine(getBounds().x,getBounds().y,getBounds().x +
        // getBounds().width -1,getBounds().y);
        // gc.drawLine(getBounds().x,getBounds().y,getBounds().x,getBounds().y +
        // getBounds().height -1);
        //
        // gc.setForeground(ThemeManager.getCurrentTheme().getColor(CONTROL_TYPE
        // + "/Border.HeaderInner.BottomRight"));
        // gc.drawLine(getBounds().x + getBounds().width
        // -1,getBounds().y,getBounds().x + getBounds().width -1,getBounds().y +
        // getBounds().height - 1);
        // gc.drawLine(getBounds().x,getBounds().y + getBounds().height
        // -1,getBounds().x + getBounds().width -1,getBounds().y +
        // getBounds().height -1);

    }

}