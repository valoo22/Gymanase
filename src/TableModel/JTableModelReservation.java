/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

/**
 *
 * @author Valoo 22
 */
import javax.swing.table.AbstractTableModel;

public class JTableModelReservation extends AbstractTableModel
    {
        private String[] columnNames = {"Salle","Association","Date","Heure"};
	private Object[][] data=new Object[10][4];
	public int getColumnCount()
            {
                return columnNames.length;
            }
	public int getRowCount()
            {
                return data.length;
            }
	public String getColumnName(int col)
            {
                return columnNames[col];
            }
	public Object getValueAt(int row, int col)
            {
                return data[row][col];
            }
	public boolean isCellEditable(int row, int col)
            {
                return (col < 2);
            }
	public void setValueAt(Object value, int row, int col)
            {
                data[row][col] = value;
                fireTableCellUpdated(row,col);
                //fireTableDataChanged();
            }
    }
