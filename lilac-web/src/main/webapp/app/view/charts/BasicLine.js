/*Ext.define('Lilac.view.charts.BasicLine', {
  extend: 'Ext.panel.Panel',
  width: 600,
  height: 400,
  title: 'test',
  items: {
    xtype: 'cartesian',
    store: {
      fields: ['name', 'data1', 'data2', 'data3', 'data4', 'data5'],
      data: [{
        'name': 'metric one',
        'data1': 10,
        'data2': 12,
        'data3': 14,
        'data4': 8,
        'data5': 13
      }, {
        'name': 'metric two',
        'data1': 7,
        'data2': 8,
        'data3': 16,
        'data4': 10,
        'data5': 3
      }, {
        'name': 'metric three',
        'data1': 5,
        'data2': 2,
        'data3': 14,
        'data4': 12,
        'data5': 7
      }, {
        'name': 'metric four',
        'data1': 2,
        'data2': 14,
        'data3': 6,
        'data4': 1,
        'data5': 23
      }, {
        'name': 'metric five',
        'data1': 27,
        'data2': 38,
        'data3': 36,
        'data4': 13,
        'data5': 33
      }]
    },
    axes: [{
      type: 'numeric',
      position: 'left',
      fields: ['data1'],
      title: {
        text: 'Sample Values',
        fontSize: 15
      },
      grid: true,
      minimum: 0
    }, {
      type: 'category',
      position: 'bottom',
      fields: ['name'],
      title: {
        text: 'Sample Values',
        fontSize: 15
      }
    }],
    series: [{
      type: 'line',
      highlight: {
        size: 7,
        radius: 7
      },
      style: {
        stroke: 'rgb(143,203,203)'
      },
      xField: 'name',
      yField: 'data1',
      marker: {
        type: 'path',
        path: ['M', -2, 0, 0, 2, 2, 0, 0, -2, 'Z'],
        stroke: 'blue',
        lineWidth: 0
      }
    }, {
      type: 'line',
      highlight: {
        size: 7,
        radius: 7
      },
      fill: true,
      xField: 'name',
      yField: 'data3',
      marker: {
        type: 'circle',
        radius: 4,
        lineWidth: 0
      }
    }]
  }
});
 */
Ext.define('Lilac.view.charts.BasicLine', {
  extend: 'Ext.panel.Panel',
  width: 600,
  height: 400,
  title: 'xxx',
  html: 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx'
});