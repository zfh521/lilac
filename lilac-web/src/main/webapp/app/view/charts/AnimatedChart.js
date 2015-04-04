Ext.define('Lilac.view.charts.AnimatedChart', {
  extend: 'Ext.Panel',
  alis: 'widget.animated-chart',
  xtype: 'animated-chart',
  initComponent: function() {
    var me = this, chart, timeAxis;
    me.items = [{
      xtype: 'chart',
      id: 'myChartId',
      style: 'background: #fff',
      width: '100%',
      height: 410,
      padding: '40 0 0 0',
      shadow: false,
      animate: true,
      insetPadding: 40,
      items: [{
        type: 'text',
        text: 'Animated Chart',
        font: '22px Helvetica',
        width: 100,
        height: 30,
        x: 40, // the sprite x position
        y: 15
      // the sprite y position
      }],
      axes: [{
        type: 'numeric',
        minimum: 0,
        maximum: 100,
        position: 'left',
        fields: ['views', 'visits', 'users'],
        title: 'Number of Hits',
        grid: {
          odd: {
            fill: '#dedede',
            stroke: '#ddd',
            'stroke-width': 0.5
          }
        }
      }, {
        type: 'Time',
        position: 'bottom',
        fields: 'date',
        title: 'Day',
        dateFormat: 'M d',
        groupBy: 'year,month,day',
        aggregateOp: 'sum',
        constrain: true,
        fromDate: new Date(2011, 0, 1),
        toDate: new Date(2011, 0, 7),
        grid: true
      }],
      series: [{
        type: 'line',
        xField: 'date',
        yField: 'visits',
        shadow: false,
        axis: 'left',
        markerConfig: {
          radius: 4
        },
        style: {
          'stroke-width': 3
        }
      }, {
        type: 'line',
        axis: 'left',
        xField: 'date',
        yField: 'views',
        markerConfig: {
          radius: 4
        },
        style: {
          'stroke-width': 3
        }
      }, {
        type: 'line',
        axis: 'left',
        xField: 'date',
        yField: 'users',
        markerConfig: {
          radius: 4
        },
        style: {
          'stroke-width': 3
        }
      }]
    }];

    this.callParent();
  }
});