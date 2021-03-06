/*
 * Copyright (C) 2015-2016 Denis Forveille titou10.titou10@gmail.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.titou10.jtb.ui.part.content;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;

/**
 * ViewerComparator for sorting of Queue Depth table content on clicking on the column header
 * 
 * @author Denis Forveille
 *
 */
public class QueueDepthViewerComparator extends ViewerComparator {
   private static final int DESCENDING = 1;

   private int              propertyIndex;
   private int              direction  = DESCENDING;

   public QueueDepthViewerComparator() {
      this.propertyIndex = 0;
   }

   public int getDirection() {
      return direction == 1 ? SWT.UP : SWT.DOWN;
   }

   public void setColumn(int column) {
      if (column == this.propertyIndex) {
         // Same column as last sort; toggle the direction
         direction = 1 - direction;
      } else {
         // New column; do an ascending sort
         this.propertyIndex = column;
         direction = DESCENDING;
      }
   }

   @Override
   public int compare(Viewer viewer, Object e1, Object e2) {
      QueueWithDepth qwd1 = (QueueWithDepth) e1;
      QueueWithDepth qwd2 = (QueueWithDepth) e2;

      // Null is the lowest possible value
      int rc = 0;
      switch (propertyIndex) {
         case 0:
            rc = qwd1.jtbQueue.getName().compareTo(qwd2.jtbQueue.getName());
            break;
         case 1:
            rc = qwd1.depth == null ? -1 : qwd2.depth == null ? 1 : qwd1.depth.compareTo(qwd2.depth);
            break;
         case 2:
            rc = qwd1.firstMessageTimestamp == null ? -1
                     : qwd2.firstMessageTimestamp == null ? 1 : qwd1.firstMessageTimestamp.compareTo(qwd2.firstMessageTimestamp);
            break;
         default:
            rc = 0;
      }
      // If descending order, flip the direction
      if (direction != DESCENDING) {
         rc = -rc;
      }
      return rc;
   }

}
